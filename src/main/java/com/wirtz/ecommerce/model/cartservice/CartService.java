package com.wirtz.ecommerce.model.cartservice;

import com.wirtz.ecommerce.model.cartline.Cartline;
import com.wirtz.ecommerce.modelutil.exceptions.InstanceNotFoundException;

public interface CartService {
	
	public void  addCartline(Cartline cartline)throws InstanceNotFoundException;

	public void  removeCartline(long cartlineId)throws InstanceNotFoundException;
	
	public void  updateCartline(Cartline cartline)throws InstanceNotFoundException;

}
