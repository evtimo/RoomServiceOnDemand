<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <title>Request Status Change</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">

    <link href="css/tempusdominus-bootstrap-4.min.css" rel="stylesheet">
    <link href="css/fontawesome/css/all.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/request.css" rel="stylesheet">
</head>

<body>

    <div id="create-request" class="toast toast-modal" role="alert" aria-live="assertive" aria-atomic="true">
        <div class="toast-header">
            <strong class="mr-auto">Request status change</strong>
            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
        <div class="toast-body">
            <form>
                <div class="form-group">
                    <label for="title">Title</label>
                    <input type="text" class="form-control" id="title" value="Room 202" disabled>
                </div>

                <div class="form-group">
                    <label for="title">Rate</label>
                    <div class="feedback-rate risingstar d-flex justify-content-center flex-row-reverse">

                        <input type="radio" id="star5" name="rating" value="5" />
                        <label for="star5" title="5 star">
                            <i class="fas fa-star"></i>
                        </label>

                        <input type="radio" id="star4" name="rating" value="4" />
                        <label for="star4" title="4 star">
                            <i class="fas fa-star"></i>
                        </label>

                        <input type="radio" id="star3" name="rating" value="3" />
                        <label for="star3" title="3 star">
                            <i class="fas fa-star"></i>
                        </label>

                        <input type="radio" id="star2" name="rating" value="2" />
                        <label for="star2" title="2 star">
                            <i class="fas fa-star"></i>
                        </label>

                        <input type="radio" id="star1" name="rating" value="1" />
                        <label for="star1" title="1 star">
                            <i class="fas fa-star"></i>
                        </label>
                    </div>
                </div>

                <div class="form-group">
                    <label for="comment">Comment</label>
                    <textarea class="form-control" id="comment" rows="3"></textarea>
                </div>

                <button type="submit" class="btn btn-primary">Send</button>
            </form>
        </div>
    </div>

    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>

    <script type="text/javascript">
        $(function () {
            $('#create-request').toast({
                autohide: false
            });

            $('#create-request').toast('show');
        });
    </script>

</body>

</html>