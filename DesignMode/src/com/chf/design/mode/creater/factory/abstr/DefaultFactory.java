package com.chf.design.mode.creater.factory.abstr;

import com.chf.design.mode.creater.factory.entity.Keybroad;
import com.chf.design.mode.creater.factory.entity.Mouse;

public class DefaultFactory implements AbstractFactory{

	@Override
	public Mouse createMouse() {
		return new Mouse();
	}

	@Override
	public Keybroad createKeybroad() {
		return new Keybroad();
	}

}
