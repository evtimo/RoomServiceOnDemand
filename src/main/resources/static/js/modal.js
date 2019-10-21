$('.modal-trigger').on('click', function () {
    $('.toast.toast-modal').toast('hide');

    var modalType = $(this).data('modal-type');
    $('#' + modalType).toast('show');
});