package com.codegym.service.seller;

import com.codegym.model.admin.Admin;
import com.codegym.model.seller.Seller;
import com.codegym.service.GeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface SellerService extends GeneralService<Seller>, UserDetailsService {
}
