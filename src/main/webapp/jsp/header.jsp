<%--https://codepen.io/karlovidek/pen/reemvP?depth=everything&order=popularity&page=3&q=slider&show_forks=false--%>


<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<link href="${contextPath}/static/css/slider.css" rel="stylesheet">


<div class="carousel slide no-padding col-lg-12  col-md-12 col-sm-12 col-xs-12"" id="slider" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#slider" data-slide-to="0" class="active"></li>
        <li data-target="#slider" data-slide-to="1"></li>
        <li data-target="#slider" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="carousel-item active">
            <img src="https://placeimg.com/1366/483/nature" alt="483">
        </div>
        <div class="carousel-item">
            <img src="https://placeimg.com/1366/481/nature" alt="481">
        </div>
        <div class="carousel-item">
            <img src="https://placeimg.com/1366/482/nature" alt="482">
        </div>
    </div>
    <a class="carousel-control-prev" href="#slider" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#slider" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
