<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">

    <title>Requests</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="/css/requests.css" rel="stylesheet">
</head>

<body>


    <div class="container">
        <ol class="breadcrumb mb-0">
            <li class="breadcrumb-item active" aria-current="page" data-request-type="all" >All</li>
            <li class="breadcrumb-item" aria-current="page" data-request-type="new" >New</li>
            <li class="breadcrumb-item" aria-current="page" data-request-type="in-progress" >In progress</li>
            <li class="breadcrumb-item" aria-current="page" data-request-type="canceled" >Canceled</li>
            <li class="breadcrumb-item" aria-current="page" data-request-type="done" >Done</li>
        </ol>

        <hr class="mt-2 mb-5">

        <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-4 mb-4 request request-done">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Room 202</h5>
                        <p class="card-text">11.01.19 10:00</p>
                        <span class="badge badge-secondary mb-2">Done</span>
                        <button type="button" class="btn btn-primary btn-sm float-right">Feedback</button>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-4 mb-4 request request-done">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Room 202</h5>
                        <p class="card-text">11.01.19 10:00</p>
                        <span class="badge badge-secondary mb-2">Done</span>
                        <a href="#" class="btn btn-primary btn-sm float-right">Feedback</a>
                    </div>
                </div>
            </div>
            <div class="col-lg-2 col-md-3 col-sm-4 mb-4 request request-canceled">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Room 202</h5>
                        <p class="card-text">11.01.19 10:00</p>
                        <span class="badge badge-danger mb-2">Canceled</span>
                    </div>
                </div>
            </div>
            <div class="col-lg-2 col-md-3 col-sm-4 mb-4 request request-in-progress">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Room 202</h5>
                        <p class="card-text">11.01.19 10:00</p>
                        <span class="badge badge-warning mb-2">In progress</span>
                    </div>
                </div>
            </div>
            <div class="col-lg-2 col-md-3 col-sm-4 mb-4 request request-new">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Room 202</h5>
                        <p class="card-text">11.01.19 10:00</p>
                        <span class="badge badge-success mb-2">New</span>
                    </div>
                </div>
            </div>
            <div class="col-lg-2 col-md-3 col-sm-4 mb-4 request request-new">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Room 202</h5>
                        <p class="card-text">11.01.19 10:00</p>
                        <span class="badge badge-success mb-2">New</span>
                    </div>
                </div>
            </div>
            <div class="col-lg-2 col-md-3 col-sm-4 mb-4 request request-new">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Room 202</h5>
                        <p class="card-text">11.01.19 10:00</p>
                        <span class="badge badge-success mb-2">New</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="/js/jquery-3.4.1.min.js"></script>
<script src="/js/popper.min.js"></script>
<script src="/js/bootstrap/bootstrap.min.js"></script>
<script>
    $(".breadcrumb-item").click(function(){
        if ($(this).hasClass("active"))
            return;

        $(".breadcrumb-item").removeClass("active");

        var requestType = $(this).data("request-type");
        $(this).toggleClass("active");

        if (requestType == "all") {
            $(".request").show();
            return;
        }
        $(".request").hide();
        $('.request-' + requestType).show();

    });
</script>
</html>