package com.chf.design.mode.creater.factory.method;

import com.chf.design.mode.creater.factory.entity.IProduct;
import com.chf.design.mode.creater.factory.entity.Mouse;

public class MouseFactory implements IMethodFactory{

	@Override
	public IProduct create() {
		return new Mouse();
	}
	
}
