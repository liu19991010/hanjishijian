var i = 0;
    $(".choose ul li").click(function () {
        $(this).addClass("bg").siblings().removeClass("bg");
        i = $(this).index();
        $(".ppt ul li").eq(i).fadeIn(100).siblings().fadeOut(100);
    });
    function jumper(){
        i++;
        if (i > 5) {
            i = 0;
        }
            $(".choose ul li").eq(i).addClass("bg").siblings().removeClass("bg");       
            $(".ppt ul li").eq(i).fadeIn(100).siblings().fadeOut(100);
       
    }
    setInterval("jumper()",5000);

