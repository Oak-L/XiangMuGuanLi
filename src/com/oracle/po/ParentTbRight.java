package com.oracle.po;

import java.util.ArrayList;
import java.util.List;

public class ParentTbRight extends TbRight {
	private List<TbRight> childTbRights = new ArrayList<>();

	public List<TbRight> getChildTbRights() {
		return childTbRights;
	}

	public void setChildTbRights(List<TbRight> childTbRights) {
		this.childTbRights = childTbRights;
	}

}
