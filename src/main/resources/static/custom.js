var map;

        function initMap() {
            map = new google.maps.Map(document.getElementById('map'), {
                center: coords,
                zoom: 10,
                scrollwhee: false
            });

            var image = { url: '/pictureforgooglemaps.png',
                        scaledSize: new google.maps.Size(50, 50)};

            var marker = new google.maps.Marker({
                position: coords,
                map: map,
                icon: image,
                animation: google.maps.Animation.BOUNCE
            });

            var contentString = '<h2>' + city + , + state + '</h2> <p>Where your dreams come true.</p>';

            var infowindow = new google.maps.InfoWindow({
                content: contentString
            })

            google.map.event.addListener(marker, 'click', function() {
                infowindow.open(map, marker);
            });
        }