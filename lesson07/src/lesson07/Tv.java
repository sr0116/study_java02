package lesson07;

public class Tv {
	// 필드(멤버 변수)
	// 전원, 채널, 볼륨
	//boolean
	
	// 메서드 (함수, 기능)
	// 전원조절, 채널업, 다운, 볼륨 업 ,다운 (총 다섯개)
	
	boolean power;
	int channel;
	int volume;
	
	
	void doPower() {
		power = !power;	
	}
	
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void volumUp () {
	volume++;
	}


	void volumDown () {
	volume--;
	}

}
