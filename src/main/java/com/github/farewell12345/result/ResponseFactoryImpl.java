package com.github.farewell12345.result;

public class ResponseFactoryImpl implements ResponseFactory {
    protected enum Code {
        SUCCESS(200),
        CREATED(201),
        ACCEPTED(202),
        NO_CONTENT(204),
        NON_AUTHORITATIVE(203),
        RESET_CONTENT(205),
        PARTIAL_CONTENT(206),
        MULTIPLE_CHOICES(300),
        MOVED_PERMANENTLY(301),
        REDIRECT(302),
        SEE_OTHER(303),
        NOT_MODIFIED(304),
        USE_PROXY(305),
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        FORBIDDEN(403),
        NOT_FOUND(404),
        METHOD_NOT_ALLOWED(405),
        INTERNAL_SERVER_ERROR(500),
        NOT_IMPLEMENTED(501),
        BAD_GATEWAY(502),
        GATEWAY_TIMEOUT(504),
        HTTP_VERSION_NOT_SUPPORTED(505);
        int status;
        String msg;
        Code(int i) {
            status = i;
            msg = this.name();
        }
    }
    public static ResponseFactoryImpl build() {
        return new ResponseFactoryImpl();
    }
    @Override
    public <T> Response<T> success(String msg,T data) {
        return new Response<T>(true, Code.SUCCESS,msg,data);
    }

    @Override
    public <T> Response<T> created(String msg, T data) {
        return new Response<T>(true, Code.CREATED,msg,data);
    }

    @Override
    public <T> Response<T> accepted(String msg, T data) {
        return new Response<T>(true, Code.ACCEPTED,msg,data);
    }

    @Override
    public <T> Response<T> noContent(String msg, T data) {
        return new Response<T>(true, Code.NO_CONTENT,msg,data);
    }

    @Override
    public <T> Response<T> nonAuthoritative(String msg, T data) {
        return new Response<T>(true, Code.NON_AUTHORITATIVE,msg,data);
    }

    @Override
    public <T> Response<T> resetContent(String msg, T data) {
        return new Response<T>(true, Code.RESET_CONTENT,msg,data);
    }

    @Override
    public <T> Response<T> partialContent(String msg, T data) {
        return new Response<T>(true, Code.PARTIAL_CONTENT,msg,data);
    }

    @Override
    public <T> Response<T> multipleChoices(String msg, T data) {
        return new Response<T>(true, Code.MULTIPLE_CHOICES,msg,data);
    }

    @Override
    public <T> Response<T> movedPermanently(String msg, T data) {
        return new Response<T>(true, Code.MOVED_PERMANENTLY,msg,data);
    }

    @Override
    public <T> Response<T> redirect(String msg, T data) {
        return new Response<T>(true, Code.REDIRECT,msg,data);
    }

    @Override
    public <T> Response<T> seeOther(String msg, T data) {
        return new Response<T>(true, Code.SEE_OTHER,msg,data);
    }

    @Override
    public <T> Response<T> notModified(String msg, T data) {
        return new Response<T>(true, Code.NOT_MODIFIED,msg,data);
    }

    @Override
    public <T> Response<T> useProxy(String msg, T data) {
        return new Response<T>(true, Code.USE_PROXY,msg,data);
    }

    @Override
    public <T> Response<T> badRequest(String msg, T data) {
        return new Response<T>(false, Code.BAD_REQUEST,msg,data);
    }

    @Override
    public <T> Response<T> unauthorized(String msg, T data) {
        return new Response<T>(false, Code.UNAUTHORIZED,msg,data);
    }

    @Override
    public <T> Response<T> forbidden(String msg, T data) {
        return new Response<T>(false, Code.FORBIDDEN,msg,data);
    }

    @Override
    public <T> Response<T> notFound(String msg, T data) {
        return new Response<T>(false, Code.NOT_FOUND,msg,data);
    }

    @Override
    public <T> Response<T> methodNotAllowed(String msg, T data) {
        return new Response<T>(false, Code.METHOD_NOT_ALLOWED,msg,data);
    }

    @Override
    public <T> Response<T> internalServerError(String msg, T data) {
        return new Response<T>(false, Code.INTERNAL_SERVER_ERROR,msg,data);
    }

    @Override
    public <T> Response<T> notImplemented(String msg, T data) {
        return new Response<T>(false, Code.NOT_IMPLEMENTED,msg,data);
    }

    @Override
    public <T> Response<T> badGateway(String msg, T data) {
        return new Response<T>(false, Code.BAD_GATEWAY,msg,data);
    }

    @Override
    public <T> Response<T> gatewayTimeout(String msg, T data) {
        return new Response<T>(false, Code.GATEWAY_TIMEOUT,msg,data);
    }

    @Override
    public <T> Response<T> httpVersionNotSupported(String msg, T data) {
        return new Response<T>(false, Code.HTTP_VERSION_NOT_SUPPORTED,msg,data);
    }

}
