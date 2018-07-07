$(document).ready(function () {
    $.getJSON("http://localhost:8080", function (result, status) {
        var v = new Vue({
            el: '#all',
            data: {
                rows: result
            }
        })
    });
});

// var app = new Vue({
//         el: '#all',
//         data: {
//             articles: [
//                 {
//                     title: '学习 JavaScript',
//                     description: 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。',
//                     release_time: '2018年5月1日 12:20:32' ,
//                     pageview_count: 100
//                 },
//                 {
//                     title: '学习 JavaScript',
//                     description: 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。',
//                     release_time: '2018年5月1日 12:20:32' ,
//                     pageview_count: 100
//                 },
//                 {
//                     title: '学习 JavaScript',
//                     description: 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。',
//                     release_time: '2018年5月1日 12:20:32' ,
//                     pageview_count: 100
//                 },
//                 {
//                     title: '学习 JavaScript',
//                     description: 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。',
//                     release_time: '2018年5月1日 12:20:32' ,
//                     pageview_count: 100
//                 },
//                 {
//                     title: '学习 JavaScript',
//                     description: 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。',
//                     release_time: '2018年5月1日 12:20:32' ,
//                     pageview_count: 100
//                 },
//                 {
//                     title: '学习 JavaScript',
//                     description: 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。',
//                     release_time: '2018年5月1日 12:20:32' ,
//                     pageview_count: 100
//                 },
//                 {
//                     title: '学习 JavaScript',
//                     description: 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。',
//                     release_time: '2018年5月1日 12:20:32' ,
//                     pageview_count: 100
//                 },
//                 {
//                     title: '学习 JavaScript',
//                     description: 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。',
//                     release_time: '2018年5月1日 12:20:32' ,
//                     pageview_count: 100
//                 },
//                 {
//                     title: '学习 JavaScript',
//                     description: 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。',
//                     release_time: '2018年5月1日 12:20:32' ,
//                     pageview_count: 100
//                 },
//                 {
//                     title: '学习 JavaScript',
//                     description: 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。',
//                     release_time: '2018年5月1日 12:20:32' ,
//                     pageview_count: 100
//                 }
//             ],
//             lastest_article:[
//                 {
//                     title:"学习Javascript",
//                     link:"https://www.baidu.com"
//                 },
//                 {
//                     title:"学习JVM",
//                     link:"https://www.sina.com"},
//                 {
//                     title:"学习CSS",
//                     link:"https://www.qq.com"
//                 },
//                 {
//                     title:"HTML笔记",
//                     link:"https://www.google.com"
//                 },
//                 {
//                     title:"CSS笔记",
//                     link:"https://www.baidu.com"
//                 },
//                 {
//                     title:"学习Python",
//                     link:"https://www.baidu.com"
//                 }
//             ],
//             current_page:1
//         },
//         methods:{
//         }
//     })
