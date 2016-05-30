import java.awt.geom.Point2D;


public abstract class SceneObject implements Renderable, Transformable, Scaleable {
	private boolean visible = true;
	private Point2D.Double transformCenter;
	private int zOrder = 0;
	
	public SceneObject ( )
	{
		transformCenter = new Point2D.Double();
	}
	
	@Override
	public void setVisible ( boolean v)
	{
		this.visible = v;
	}
	
	@Override
	public boolean isVisible ( )
	{
		return visible;
	}
	
	@Override
	public void setTransformCenter ( double x, double y)
	{
		transformCenter = new Point2D.Double( x, y);
	}
	
	@Override
	public Point2D.Double getTransformCenter ( )
	{
		return new Point2D.Double( transformCenter.x, transformCenter.y);
	}
	
	@Override
	public int getZ ()
	{
		return zOrder;
	}
	
	@Override
	public void setZ ( int z)
	{
		zOrder = z;
	}
}
