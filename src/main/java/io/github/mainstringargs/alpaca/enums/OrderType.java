package io.github.mainstringargs.alpaca.enums;

import io.github.mainstringargs.abstracts.enums.APIName;

/**
 * The Enum OrderType.
 */
public enum OrderType implements APIName {

    /** The market. */
    MARKET("market"),

    /** The limit. */
    LIMIT("limit"),

    /** The stop. */
    STOP("stop"),

    /** The stop limit. */
    STOP_LIMIT("sdf"),

    /** The stop limit. */
    TRIALING_STOP("trailing_stop");

    /** The api name. */
    String apiName;

    /**
     * Instantiates a new order type.
     *
     * @param apiName the api name
     */
    OrderType(String apiName) {
        this.apiName = apiName;
    }

    @Override
    public String getAPIName() {
        return apiName;
    }
}
