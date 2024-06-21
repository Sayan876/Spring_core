package SecondSpring;

import java.util.Properties;
import java.util.*;

public class MySessionFactory {
	private MyDataSource datasource;
	private Properties hproperties;
	private List<String> mresources;

	public MyDataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(MyDataSource datasource) {
		this.datasource = datasource;
	}

	public Properties getHproperties() {
		return hproperties;
	}

	public void setHproperties(Properties hproperties) {
		this.hproperties = hproperties;
	}

	public List<String> getMresources() {
		return mresources;
	}

	public void setMresources(List<String> mresources) {
		this.mresources = mresources;
	}

	@Override
	public String toString() {
		return "MySessionFactory [datasource=" + datasource + ", hproperties=" + hproperties + ", mresources="
				+ mresources + "]";
	}
	
	

}
