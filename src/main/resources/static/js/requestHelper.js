$('.breadcrumb-item').click(function(){
    if ($(this).hasClass("active"))
        return;

    $('.breadcrumb-item').removeClass("active");

    var requestType = $(this).data("request-type");
    $(this).toggleClass("active");

    if (requestType === "all") {
        $(".request").show();
        return;
    }
    $('.request').hide();
    $('.request-' + requestType).show();

});
