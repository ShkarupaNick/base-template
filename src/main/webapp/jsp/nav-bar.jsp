<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>


<link href="${contextPath}/static/css/nav-menu.css" rel="stylesheet">


<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Expand at md</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#responsive_portal" aria-controls="responsive_portal" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="responsive_portal">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="#">Home<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Shedule</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Browse</a>
            </li>

            <sec:authorize access="isAnonymous()">
                <li><a class="nav-link" href="registration">Sign up</a></li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                    <div class="dropdown-menu" aria-labelledby="dropdown04">
                        <jsp:include page="social_login.jsp"/>
                        <a class="dropdown-item" href="#">Shedule</a>
                        <a class="dropdown-item" href="#">Browse</a>
                    </div>
                </li>
            </sec:authorize>
        </ul>
        <form class="form-inline my-2 my-md-0">
            <input class="form-control" type="text" placeholder="Search">
        </form>
    </div>
</nav>
<c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session"/>

<script src="${contextPath}/static/js/nav-menu.js"></script>
