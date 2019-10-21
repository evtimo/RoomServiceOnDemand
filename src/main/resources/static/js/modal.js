$('.modal-trigger').on('click', function () {
    $('.toast.toast-modal').addClass('hide');

    var modalType = $(this).data('modal-type');
    $('#' + modalType).removeClass('hide').toast('show');
});