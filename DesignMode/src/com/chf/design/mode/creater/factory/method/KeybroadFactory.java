package com.chf.design.mode.creater.factory.method;

import com.chf.design.mode.entity.IProduct;
import com.chf.design.mode.entity.Keybroad;

public class KeybroadFactory implements IMethodFactory{

	@Override
	public IProduct create() {
		return new Keybroad();
	}

}
