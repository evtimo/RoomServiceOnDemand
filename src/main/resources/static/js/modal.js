$('.modal-trigger').on('click', function () {
    $('.toast.toast-modal').addClass('hide');

    var modalType = $(this).data('modal-type');
    $('#' + modalType).removeClass('hide').toast('show');

    if(modalType === "feedback") {
        $('#feedback-title').val("Room " + $(this).data('room'));
    }

    if(modalType === "request-change") {
        $('#change-title').val("Room " + $(this).data('room'));
        $('#change-status').val($(this).data('status'))
    }
});