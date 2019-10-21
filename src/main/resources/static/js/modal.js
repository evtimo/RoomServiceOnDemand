$('.modal-trigger').on('click', function () {
    $('.toast.toast-modal').addClass('hide');

    var modalType = $(this).data('modal-type');
    $('#' + modalType).removeClass('hide').toast('show');

    if(modalType === "feedback") {
        $('#feedback-title').val($(this).data('room'));
    }

    if(modalType === "request-change") {
        $('#change-id').val($(this).data('id'));
        $('#change-status').val($(this).data('status'))
        $('#change-title').val($(this).data('room'))
    }
});