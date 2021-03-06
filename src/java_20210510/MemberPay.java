package java_20210510;


public class MemberPay {
	private int seq;
	private int group;
	private String name;
	private  int price;
	private boolean valid;
	private String status;
	private String sdate;
	private String edate;
	private String regdate;
	
	// seq(시퀀트)의 setter → seq를 수정할 때 사용
	public void setSeq(int seq) {
		//this를 사용한 이유는 로컬변수와 멤버변수를 구분하기 위해서 사용
		this.seq = seq; // 왼쪽은 멤버변수고 오른쪽은 로컬변수
	}
	//seq의 getter → seq의 정보를 가져올 때 사용
	public int getSeq() {
		return seq; // return this.seq 이렇게 되어있는데 사실 구분할 이유가 없어서 this.seq를 안 씀
	}
	
	
	// group의 setter 생성
	public void setGroup(int group) {
		this.group = group;
	}
	
	// group의 getter 생성 - 매개변수 없어서 () 여기 비워놓음
	public int getGroup() {
		return group;
	}
	
	// name의 setter 생성
	public void setName(String name) {
		this.name = name; // 맴버변수가 name 이고 로컬변수로 name 넣기
	}
	
	// name의 getter 생성
	public String getName() {
		return name;
	}
	
	// price의 getter 생성
	public void setPrice(int price) {
		this.price = price;
	}
	
	// price의 getter 생성
	public int getPirce() {
		return price;
	}
	// valid의 setter 생성
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	// vaild의 getter 생성 → vaild 자료형이 boolean일 경우는 getXXX가 아니라 isXXX로 생성한다.
	public boolean isValid() {
		return valid;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getSdate() {
		return sdate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getEdate() {
		return edate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getRegdate() {
		return regdate;
	}
	
	
}











