package com.chf.design.mode.creater.factory.abstr;

import com.chf.design.mode.entity.Keybroad;
import com.chf.design.mode.entity.Mouse;

public interface AbstractFactory {
	public Mouse createMouse();
	
	public Keybroad createKeybroad();
}
