package problem02;

public class SmartPhone extends MusicPhone {
	
	public void execute(String function) {
		if (function.equals("통화")) {
			System.out.println(call());
			return;
		}else if(function.equals("음악")) {
			System.out.println(playMusic());
		}else if(function.equals("앱")) {
			System.out.println(runApp());
		}
	}

	@Override
	public String playMusic() {
		// TODO Auto-generated method stub
		return "스트리밍";
	}

	public String runApp() {
		return "앱실행";
	}
}