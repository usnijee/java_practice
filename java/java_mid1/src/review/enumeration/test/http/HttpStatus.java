package review.enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK",true),
    BAD_REQUEST(400,"Bad Request",false),
    NOT_FOUND(404,"Not Found",false),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error",false);

    private final int code;
    private final String message;
    private final boolean isSuccess;

    HttpStatus(int code, String message, boolean isSuccess) {
        this.code = code;
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        for (HttpStatus status : values()) {
            if (status.code == httpCodeInput) {
                return status;
            }
        }
        return null;
    }
}
