package com.github.farewell12345.result;

interface ResponseFactory {
    public <T> Response<T> success(String msg,T data);
    public <T> Response<T> created(String msg,T data);
    public <T> Response<T> accepted(String msg,T data);
    public <T> Response<T> noContent(String msg,T data);
    public <T> Response<T> nonAuthoritative(String msg,T data);
    public <T> Response<T> resetContent(String msg,T data);
    public <T> Response<T> partialContent(String msg,T data);
    public <T> Response<T> multipleChoices(String msg,T data);
    public <T> Response<T> movedPermanently(String msg,T data);
    public <T> Response<T> redirect(String msg,T data);
    public <T> Response<T> seeOther(String msg,T data);
    public <T> Response<T> notModified(String msg,T data);
    public <T> Response<T> useProxy(String msg,T data);
    public <T> Response<T> badRequest(String msg,T data);
    public <T> Response<T> unauthorized(String msg,T data);
    public <T> Response<T> forbidden(String msg,T data);
    public <T> Response<T> notFound(String msg,T data);
    public <T> Response<T> methodNotAllowed(String msg,T data);
    public <T> Response<T> internalServerError(String msg,T data);
    public <T> Response<T> notImplemented(String msg,T data);
    public <T> Response<T> badGateway(String msg,T data);
    public <T> Response<T> gatewayTimeout(String msg,T data);
    public <T> Response<T> httpVersionNotSupported(String msg,T data);
}
