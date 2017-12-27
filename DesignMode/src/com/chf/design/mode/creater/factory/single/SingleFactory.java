package com.chf.design.mode.creater.factory.single;

import com.chf.design.mode.creater.factory.constants.ProductType;
import com.chf.design.mode.creater.factory.entity.IProduct;
import com.chf.design.mode.creater.factory.entity.Keybroad;
import com.chf.design.mode.creater.factory.entity.Mouse;

public class SingleFactory {
	public IProduct createProduct(String type) {
		if(ProductType.MOUSE.equals(type)) {
			return new Mouse();
		} else if(ProductType.KEYBROAD.equals(type)) {
			return new Keybroad();
		}
		
		return null;
	}
}