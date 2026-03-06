import os
import time
from google import genai
from dotenv import load_dotenv 

'''

Tiene que tener una linea para qe estacionen el auto atrás de eso. Asi cuando salen del auto los toma bien.
Para todos los videos ponerlos en x2 y bajar la resolución a 720p. 
si line-cross & human detected antes de las 9: mandar ultimos wait 30s y mandar a gemini para analizar cant personas. 
" " " dps de las 9: Mandar 2 minutos de video a gemini de la entrega de materiales. Analizar que están entregando, aproximar las cantidades. 
Cada 1h, mandar video de 1min a gemini para que analize si se está trabajando.
Ignorar las hs de 18:00 a 8:00. 

'''

# --- Configuration ---
load_dotenv()

# The video path is now defined here, using the location you provided:
VIDEO_FILE_PATH = "/home/Alumno27.FISCINA.Facundo@ipm.edu.ar/FiscinaFuentes/other_interesting_stuff/my-video_1.mp4" 
MODEL_NAME = "gemini-2.5-flash"
PROMPT = "Count the people in the video, and tell me what they are doing"

# --- Helper Functions ---

def upload_and_analyze_video(client: genai.Client, video_path: str, prompt: str):
    """Uploads a video, sends it for analysis, and returns the response."""
    uploaded_file = None
    
    # 1. Handle File Upload
    print(f"Uploading file: {video_path}...")
    try:
        # **🔥 FIX IS HERE: Removed 'display_name' argument 🔥**
        uploaded_file = client.files.upload(
            file=video_path 
            # display_name is removed
        )
        print(f"Uploaded file: {uploaded_file.name} | URI: {uploaded_file.uri}")

        # Wait for the file to be processed 
        while uploaded_file.state.name == "PROCESSING":
            print("Processing file... waiting 5 seconds.")
            time.sleep(5)
            uploaded_file = client.files.get(name=uploaded_file.name)
        
        if uploaded_file.state.name == "FAILED":
             print(f"File processing failed: {uploaded_file.name}")
             return "Analysis failed due to file processing error."

        # 2. Generate Content (Analysis)
        print("Generating content...")
        response = client.models.generate_content(
            model=MODEL_NAME, 
            contents=[uploaded_file, prompt] 
        )
        
        return response.text

    except Exception as e:
        return f"An error occurred during upload or generation: {e}"
    
    finally:
        # 3. Clean Up
        if uploaded_file:
            print(f"\nCleaning up and deleting file: {uploaded_file.name}")
            client.files.delete(name=uploaded_file.name)
            print("Cleanup complete.")

# --- Main Execution ---

if __name__ == "__main__":
    
    # Initialize Client
    try:
        client = genai.Client()
        print("Gemini Client initialized successfully.")
    except Exception as e:
        print(f"Error initializing client: {e}")
        print("Please ensure your GEMINI_API_KEY is correctly set in your .env file.")
        exit(1)
        
    # Check if the video path exists before proceeding
    if not os.path.exists(VIDEO_FILE_PATH):
        print(f"Error: Video file not found at '{VIDEO_FILE_PATH}'")
        print("Please ensure the file exists and you have read permission.")
        exit(1)

    # Run the analysis
    analysis_result = upload_and_analyze_video(client, VIDEO_FILE_PATH, PROMPT)
    
    print("\n--- Analysis Result ---")
    print(analysis_result)
    print("-----------------------")