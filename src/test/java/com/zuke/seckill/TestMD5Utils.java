package com.zuke.seckill;

import com.zuke.seckill.util.MD5Util;
import org.junit.jupiter.api.Test;

public class TestMD5Utils {

    @Test
    public void t1(){
        //��������12345
        //��ȡ������������м����롾���ͻ��˼��ܼ��κ��������ϴ�������롿
        String midPass = MD5Util.inputPassToMidPass("12345");
        System.out.println("midPass:"+midPass);

        String dbPass1 = MD5Util.midPassToDbPass(midPass, "33GoVAJW4tr5W5");
        System.out.println("dbPass1:"+dbPass1);

        //�ҽ������м䷽���ĳ�private�󣬿���ֱ�ӵ�����������շ���

        //���մ洢���ݿ������
        String dbPass2 = MD5Util.inputPassToDbPass("12345", "33GoVAJW4tr5W5");
        System.out.println("dbPass:"+dbPass2);
    }
}
