package com.chf.design.mode.creater.builder;

import com.chf.design.mode.entity.IComputor;

public interface IBuilder {
	public void createMonitor();

	public void createMainframe();

	public void createKeybroad();

	public IComputor getComputor();
}
