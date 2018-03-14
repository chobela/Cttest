package appexpress.cttest.com.cttest.app;

import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;

public class Config {

    // PayPal app configuration
    public static final String PAYPAL_CLIENT_ID = "ARl3VIG4BUaF3lQ_txTQ1vwICW3ScFZddtRoDj1FHgXtmZy0_5dOoJ2TGbll626UwXZGaIbnjq5BSn5W";
    public static final String PAYPAL_CLIENT_SECRET = "EMgEqYhivLoFnqMoEWPNIpTz8CgUkqfWrNFq0wB3aZC1aSDKacZ7YHOGHEeHFSAtsDbKI4pDISHaPCif";

    public static final String PAYPAL_ENVIRONMENT = PayPalConfiguration.ENVIRONMENT_SANDBOX;
    public static final String PAYMENT_INTENT = PayPalPayment.PAYMENT_INTENT_SALE;
    public static final String DEFAULT_CURRENCY = "USD";

    // Our php+mysql server urls
    public static final String URL_PRODUCTS = "http://stepup2017.000webhostapp.com/PayPalServer/v1/products";
    public static final String URL_VERIFY_PAYMENT = "http://stepup2017.000webhostapp.com/PayPalServer/v1/verifyPayment";

} 