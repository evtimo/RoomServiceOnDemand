$('.toast-modal').toast({
    autohide: false
});

$('.modal-trigger').on('click', function () {
    $('.toast.toast-modal').addClass('hide');

    var modalType = $(this).data('modal-type');
    var modal = $('#' + modalType);
    modal.removeClass('hide').toast('show');

    switch (modalType) {
        case "feedback":
            $('#feedback-title').val("Room " + $(this).data('room'));
            $('#request-id').val($(this).data('id'));
            break;
        case "request-change":
            $('#change-title').val("Room " + $(this).data('room'));
            $('#change-status').val($(this).data('status'));
            break;
        default:
            $('form', modal).get(0).reset();
            break;
    }
});