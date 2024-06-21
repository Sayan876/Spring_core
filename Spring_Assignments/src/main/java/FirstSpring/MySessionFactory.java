package FirstSpring;

public class MySessionFactory {
	
	private MyDataSource datasource;
	private String hbm2_ddl_auto;
	private String dialect;
	private boolean show_sql;
	private boolean format_sql;
	public MyDataSource getDatasource() {
		return datasource;
	}
	public void setDatasource(MyDataSource datasource) {
		this.datasource = datasource;
	}
	public String getHbm2_ddl_auto() {
		return hbm2_ddl_auto;
	}
	public void setHbm2_ddl_auto(String hbm2_ddl_auto) {
		this.hbm2_ddl_auto = hbm2_ddl_auto;
	}
	public String getDialect() {
		return dialect;
	}
	public void setDialect(String dialect) {
		this.dialect = dialect;
	}
	public boolean isShow_sql() {
		return show_sql;
	}
	public void setShow_sql(boolean show_sql) {
		this.show_sql = show_sql;
	}
	public boolean isFormat_sql() {
		return format_sql;
	}
	public void setFormat_sql(boolean format_sql) {
		this.format_sql = format_sql;
	}
	@Override
	public String toString() {
		return "MySessionFactory [datasource=" + datasource + ", hbm2_ddl_auto=" + hbm2_ddl_auto + ", dialect="
				+ dialect + ", show_sql=" + show_sql + ", format_sql=" + format_sql + "]";
	}
	
	

}
