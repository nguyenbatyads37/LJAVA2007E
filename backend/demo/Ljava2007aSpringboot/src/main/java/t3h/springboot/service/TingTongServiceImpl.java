package t3h.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class TingTongServiceImpl implements TinhTongService {

	@Override
	public int tinhtong(int num1, int num2) {
		return num1 + num1;
	}

}
