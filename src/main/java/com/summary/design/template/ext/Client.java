package com.summary.design.template.ext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要 1-需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HummerH1Model h1Model = new HummerH1Model();
        if ("0".equals(type)) {
            h1Model.setAlarmFlag(false);
        }
        h1Model.run();
        HummerH2Model h2Model = new HummerH2Model();
        h2Model.run();
    }
}
