package com.cg.training.service;
@FunctionalInterface
public interface UserValidation {
	Boolean validate(String username,String password);
}
