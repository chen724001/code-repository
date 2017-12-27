package com.chf.design.mode.creater.factory.method;

import com.chf.design.mode.creater.factory.entity.IProduct;
import com.chf.design.mode.creater.factory.entity.Keybroad;

public class KeybroadFactory implements IMethodFactory{

	@Override
	public IProduct create() {
		return new Keybroad();
	}

}
