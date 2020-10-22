package t3h.springboot.service.impl;

import org.springframework.stereotype.Service;

import t3h.springboot.service.TinhTongService;

@Service
public class TingTongServiceImpl implements TinhTongService {

	@Override
	public int tinhtong(int num1, int num2) {
		return num1 + num1;
	}

}
