$('.toast-modal').toast({
    autohide: false
});

$('.modal-trigger').on('click', function () {
    $('.toast-modal').toast('hide');

    var modalType = $(this).data('modal-type');
    var modal = $('#' + modalType);
    modal.toast('show');

    switch (modalType) {
        case "feedback":
            $('#feedback-title').val("Room " + $(this).data('room'));
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