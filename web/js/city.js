$(function () {
    $("#province").change(function () {
        var pid = $(this).val();
        // console.log(pid);
        $.post("ServletCity", {pid: pid}, function (data, status) {
            // 清空以前的值
            $("#city").html("<option value=''>--请选择--</option>");
            // 遍历
            $(data).find("city").each(function () {
                //遍历出来的每一个city，取它的孩子。 id , cname
                var id = $(this).children("id").text();
                var cname = $(this).children("cname").text();

                $("#city").append("<option value='" + id + "'>" + cname + "</option>");
            });
        })
    });
});