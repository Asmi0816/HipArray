package hip.view;
import hip.controller.HipController;
import javax.swing.*;
import java.awt.Dimension;
public class HipFrame extends JFrame
{
private HipController baseController;
private HipPanel basePanel;

public HipFrame(HipController baseController)
{
	super();
	this.baseController = baseController;
	basePanel = new HipPanel(baseController);
	
	setupFrame();
	
	
	
}

private void setupFrame()
{
	this.setContentPane(basePanel);
	this.setTitle("Hipsters 2016");
	this.setSize(new Dimension(600, 400));
	this.setResizable(false);
	this.setVisible(true);
	
}
}
