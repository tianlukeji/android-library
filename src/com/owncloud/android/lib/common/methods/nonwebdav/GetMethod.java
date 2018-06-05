package com.owncloud.android.lib.common.methods.nonwebdav;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetMethod extends HttpMethod {

    public GetMethod(OkHttpClient okHttpClient, Request baseRequest) {
        super(okHttpClient, baseRequest);
    }

    @Override
    public int execute() throws IOException {
        mRequest = mBaseRequest
                .newBuilder()
                .get()
                .build();

        mResponse = mOkHttpClient.newCall(mRequest).execute();
        return mResponse.code();
    }
}