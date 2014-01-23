package test.owera.common.log;

import com.owera.common.log.Context;

public class LoggingClass implements Runnable {

	private int id;

	public LoggingClass(int id) {
		this.id = id;
	}

	public void run() {
		int i = 0;
		while (true) {
			Context.put(Context.X, "UnitId-" + id + "-" + i++, 100000);
			Log.info(LoggingClass.class, "Test");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
