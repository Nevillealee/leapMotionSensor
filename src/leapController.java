import java.io.IOException; 
import java.awt.AWTException; 
import java.awt.GraphicsDevice; 
import java.awt.GraphicsEnvironment; 
import java.awt.MouseInfo; 
import java.awt.Point; 
import java.awt.Robot; 
import java.awt.event.InputEvent; 
import java.awt.event.KeyEvent; 
import com.leapmotion.leap.*; 
import com.leapmotion.leap.Controller.PolicyFlag; 


	
	 class leapListener extends Listener{
		//(mandatory method) what happens when controller gets initialized
		public void onInit(Controller controller){
			System.out.println("Initialized");		
		}
		// (mandatory method)put motion gestures in this method like sweep, circle, key tap etc...
		public void onConnect(Controller controller){
			System.out.println("Connected to motion sensor");
			controller.enableGesture(Gesture.Type.TYPE_SWIPE);
			controller.enableGesture(Gesture.Type.TYPE_CIRCLE);
			controller.enableGesture(Gesture.Type.TYPE_SCREEN_TAP);
			controller.enableGesture(Gesture.Type.TYPE_KEY_TAP);
		}
		//mandatory method
		public void onDisconnect(Controller controller){
			System.out.println("Motion sensor disconnected");
		}
		public void onExit(Controller controller){
			System.out.println("Exited");
		}
		//(mandatory method) this is where we do motion detection and get data from gestures
		public void onFrame(Controller controller){
			
		}
	}
	
	public class leapController{
		public static void main(String[] args) throws AWTException { 
			
			leapListener leapL = new leapListener();
			
			Controller controller = new Controller();
			
		}
}