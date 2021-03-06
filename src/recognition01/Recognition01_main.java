package recognition01;

import java.io.File;
import java.io.FileNotFoundException;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectFacesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectedFaces;

//api 
public class Recognition01_main {
	public static void main(String[] args) {
		VisualRecognition service = new VisualRecognition("2018-03-19");
		service.setApiKey("1518106");

		DetectFacesOptions detectFacesOptions = null;
		try {
			detectFacesOptions = new DetectFacesOptions.Builder()
			  .imagesFile(new File("img/prez.jpg"))
			  .build();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DetectedFaces result = service.detectFaces(detectFacesOptions).execute();
		System.out.println(result);

	
	}
}
