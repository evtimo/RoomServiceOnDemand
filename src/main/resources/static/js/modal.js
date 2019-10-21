$('.modal-trigger').on('click', function () {
    var modalType = $(this).data('modal-type');
    $('#' + modalType).toast('show');
});