/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.melexis;

import fit.ActionFixture;

/**
 *
 * @author brh
 */
public abstract class AdminDepositsMoneyInUserAccountFixture extends ActionFixture {

	public abstract boolean createUserWithPassword(String user, String password);
	public abstract boolean grantRoleTo(String role, String user);
	public abstract boolean setUserBalanceTo(String user, int amount);
	public abstract boolean loginAsUserWithPassword(String user, String password);
	public abstract boolean enterValueInField(String value, String field);
	public abstract boolean pressButton(String name);
	public abstract boolean verifyBalanceUserEqualTo(String user, Double balance);

	public abstract boolean orderProduct(String product);
	public abstract boolean checkFieldIsNotPresent(String field);
}
