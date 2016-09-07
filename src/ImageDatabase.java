import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 * Class used to store Image Information
 */
public class ImageDatabase {
    private ArrayList<Image> mImages;
    private boolean mIsExtractingColor;
    private boolean mIsExtractingFeatures;
    
    public ImageDatabase() {
        initializeVariables();
        loadImages();
    }
    
    /**
     * Searches for a list of similar images
     */
    public ArrayList<Image> search(Image query) {
        return new ArrayList<>();
    }
    
    public boolean isExtractingColor() {
        return mIsExtractingColor;
    }
    
    public boolean isExtractingFeature() {
        return mIsExtractingFeatures;
    }
    
    public void setExtractFeature(boolean set){
        mIsExtractingFeatures = set;
    }
    
    public void setExtractColor(boolean set){
        mIsExtractingFeatures = set;
    }
    
    public ArrayList<Image> getImages() {
        return new ArrayList<Image>();
    }
    
    private void initializeVariables() {
        mImages = new ArrayList<>();
    }

    private boolean loadImages() {
        boolean hasSucceeded = true;
        
        try {
            
        } catch (Exception e) {
            hasSucceeded = false;
        }
        
        return hasSucceeded;
    }

    private boolean loadImage(String path) {
        boolean hasSucceeded = true;
        
        try {
            
        } catch (Exception e) {
            hasSucceeded = false;
        }
        
        return hasSucceeded;
    }
    
//	private void loadBrowseImage() {
//		JFileChooser fileChooser = new JFileChooser();
//		fileChooser.setDialogTitle("Please select a sample image");
//		String path = "";
//		int returnVal =  fileChooser.showOpenDialog(ImageSearchUI.this);
//		if (returnVal == JFileChooser.APPROVE_OPTION) {
//			imagePath = fileChooser.getSelectedFile().getAbsolutePath();
//			browseImg = null;
//			try {
//				browseImg = ImageIO.read(new File(imagePath));
//				
//				
//				browseImg = browseImg.getScaledInstance(width, -1, browseImg.SCALE_DEFAULT);
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			browseImageJL.setIcon(new ImageIcon(browseImg));
//		}
	}
    
}
