package lecture.babymonitor;

public interface Observer {
	public void update(String babyname, boolean crying, int level);
}
