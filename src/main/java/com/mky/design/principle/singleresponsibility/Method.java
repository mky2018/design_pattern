package com.mky.design.principle.singleresponsibility;

/**
 * @author makaiyu
 * @date 2020-05-03 13:34
 */
public class Method {

    private void updateUserInfo(String username, String userAddress) {
        username = "mky";
        userAddress = "bj";
    }

    private void updateUserInfo(String username, String... properties) {
        username = "mky";
    }

    private void updateUsername(String username) {
        username = "mky";
    }

    private void updateUserAddress(String userAddress) {
        userAddress = "bj";
    }

    private void updateUserInfo(String username, String userAddress, boolean bool) {
        if(bool){
            // todo something1 建议拆分方法
        }else {
            // todo something2 建议拆分方法
        }
        username = "mky";
        userAddress = "bj";
    }

}
