package com.example.project2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.lang.Math;
import java.util.List;
import java.util.Map;


//this class is used to create and provide product data.
public class DataProvider {


    //this method is to generate the new products data.
    //there are 6 elements inside the map. The first is the productText, the second is product price,
    //the third one is number of images, the forth one is the product type, the fifth one is order digit,
    //the sixth is the product description.
    public static Map<Integer, List<String>> generatenewProducts() {
        Map<Integer, List<String>>words =
                new LinkedHashMap<Integer, List<String>>();
        words.put(1, Arrays.asList("Samsung Galaxy Z Fold3 5G Dual SIM Foldable Smartphone(Black)","$2,698","5","newproducts","1"
               , "Flex mode supported at angles between 75° and 115°. For your convenience, it may be difficult to maintain Flex mode while moving due to shaking or other movement."));
        words.put(2, Arrays.asList("Samsung Galaxy A13 (2022) Dual SIM Smartphone(Light Blue)","$348","5","newproducts","2"
                , "Expand your view to the 6.6-inch Infinity-V Display of Galaxy A13 and see what you've been missing.Snap memorable moments in clear detail with the 50MP Main Camera."));
        words.put(3, Arrays.asList("ASUS Vivobook 15 R565EA Edu Laptop 15.6 FHD Intel i3-1115G4 8GB 256GB SSD","$910","5","newproducts","3"
                , "It's powered by up to an Intel® Core™ i3 processor with 8 GB 2400 MHz RAM."));
        words.put(4, Arrays.asList("HP Probook x360 435 G8 Ultrabook 13.3 FHD Touch Ryzen3 5400U 8GB 256GB SSD","$1,171","5","newproducts","4"
                , "The versatile ultraslim HP ProBook x360 435 adapts throughout the day, with four use modes that enable you to create, present, and collaborate in a comfortable way."));
        words.put(5, Arrays.asList("Sony WH-1000XM5 Wireless Over-Ear Noise-Cancelling Headphones","$598","5","newproducts","5"
                , "Specially developed by Sony, the new Integrated Processor V1 unlocks the full potential of our HD Noise Cancelling Processor QN1. This unique combination of technology controls eight microphones to deliver unprecedented noise cancelling quality."));
        words.put(6, Arrays.asList("NOS X700 Complete Streaming Starter Pack","$199","5","newproducts","6"
                , "The package includes a microphone that reduces background noise and focuses on your voice, boom arm, tripod, USB ring light, Full HD webcam and a USB hub with four ports."));
        words.put(7, Arrays.asList("Orico 6 in 1 Multifunction Docking Station","$64","4","newproducts","7"
                , "Do you want to work with two screens or mirror one screen? Then this is possible by means of the aluminum type-C hub with 4K HDMI connection. Enjoy excellent 4K image quality."));
        words.put(8, Arrays.asList("Steelseries 2022 Aerox 5 RGB Wireless Ultra Lightweight Gaming Mouse","$278","5","newproducts","8"
                , "The macros you need are at your fingertips, and so is victory. Instantly execute game-winning actions with a 5-button side panel, including a custom-built up/down flick switch."));
        words.put(9, Arrays.asList("Samsung 50AU800A 50 4K Premium Hotel / Commercial TV","$1,035","5","newproducts","9"
                , "Offer guests the vivid picture quality of home entertainment systems, using upscaling technology to display content in UHD resolution (3,840 X2,160), four times the pixels of standard FHD."));
        words.put(10, Arrays.asList("Samsung The FreeStyle - Full HD Smart Portable Projector","$1,699","5","newproducts","110"
                , "The Freestyle is compatible with external batteries that support USB-PD and 50W/20V output or above."));
        return words;
    }

    //this method is to generate the top pick products data.
    //there are 6 elements inside the map. The first is the productText, the second is product price,
    //the third one is number of images, the forth one is the product type, the fifth one is order digit,
    //the sixth is the product description.
    public static Map<Integer, List<String>> generateTopPicks() {
        Map<Integer, List<String>>words =
                new LinkedHashMap<Integer, List<String>>();
        words.put(1, Arrays.asList("Sony WH-1000XM5 Wireless Over-Ear Noise-Cancelling Headphones - Black","$598","3","topproducts","1"
                , "The brand-new super-comfortable lightweight design will keep you in the zone for up to 30 hours, and get ready for your next adventure in a flash thanks to USB-PD fast charging."));
        words.put(2, Arrays.asList("Xiaomi 12 Pro 5G Dual SIM Smartphone 12GB+256GB - Blue","$1,598","3","topproducts","2"
                , "Embracing Snapdragon® 8 Gen 1, the flagship 4nm processor is designed to master all the phenomenal innovations with more dynamic power and a cooler attitude."));
        words.put(3, Arrays.asList("Samsung Galaxy A53 5G (2022) Dual SIM Smartphone","$749","3","topproducts","3"
                , "The Galaxy A53 5G is designed to stand out. With the Ambient Edge blending the camera with the body seamlessly, your Galaxy is entirely beautiful and fully functional with added battery capacity inside a slimmer, matte frame."));
        words.put(4, Arrays.asList("Microsoft Surface Laptop Go (Student Price) -12.4-i5 8GB Ram 128GB","$1,030","3","topproducts","4"
                , "Browse, scroll, navigate and binge-just as you would on a smartphone-on the 12.4\" PixelSense™ HD touchscreen with precision colour calibration."));
        words.put(5, Arrays.asList("NETGEAR Insight Managed WAX610 WiFi 6 Dual-Band AX1800 Indoor Access","$238","3","topproducts","5"
                , "The WAX610 is ideal in high-density client device environments, such as schools, hotels, restaurants and conference centers, and provides enterprise-grade Wi-Fi network security"));

        return words;
    }

    //this method is to generate the deals product data.
    //there are 6 elements inside the map. The first is the productText, the second is product price,
    //the third one is number of images, the forth one is the product type, the fifth one is order digit,
    //the sixth is the product description.
    public static Map<Integer, List<String>> generateDeals() {
        Map<Integer, List<String>>words =
                new LinkedHashMap<Integer, List<String>>();
        words.put(1, Arrays.asList("Google Nest Cam with Floodlight (Wired)","$462/$549","4","deals","1"
                , "The Nest Cam security camera knows the difference between people, pets and vehicles, so it can send alerts that matter to you."));
        words.put(2, Arrays.asList("Philips PUT7906/75 65 4K Android Smart TV with Ambilight","$888/$998","4","deals","2"
                ,"The action leaps from the screen with this Philips 4K Android TV. HDR content looks great, and Ambilight makes movies, shows, and games feel bigger and more immersive. "));
        words.put(3, Arrays.asList("Samsung Q600A 3.1.2 Channel Sound Bar","$599/$699","5","deals","3"
                , "Control your Philips Android TV with your voice. Want to play a game, watch Netflix, or find content and apps in the Google Play store? Just tell your TV."));
        words.put(4, Arrays.asList("Cooler Master MasterPulse CH321 USB Multi-Platform Gaming Headset","$45/$65","5","deals","4"
                , "An onboard sound card plus 50mm Neodymium drivers on the CH321 offers top-tier sound typically found in more premium headsets."));
        words.put(5, Arrays.asList("Fitbit Versa 3 Smart Watch - Black","$289/449","4","deals","5"
                , "Do more, charge less and fuel up for a full day in just 12 minutes with fast charging. Stay connected on the go with call, text and smartphone app notifications from your wrist. "));
        words.put(6, Arrays.asList("KONIC Series 696 55 4K Android Smart TV","$803/$898","4","deals","6"
                , "Offers a screen with a resolution of 3840*2160 pixels, which is capable of reproducing the original visual details with amazing fidelity. So every picture is vivid before your eyes."));
        words.put(7, Arrays.asList("Xiaomi Mi Home Wi-Fi Security Camera 2K with Magnetic Mount","$54/$78","5","deals","7"
                , "The Mi Camera 2K (Magnetic Mount) comes equipped with AI human detection technology, which can effectively filter out false alarms, so you will only be notified when there is human motion."));
        words.put(8, Arrays.asList("HP Officejet 200 Portable printer","$345/$438","5","deals","8"
                , "Simply print from your laptop or mobile devices wirelessly, with or without a router. Start printing in minutes. HP Auto Wireless Connect makes setup easy."));
        words.put(9, Arrays.asList("Silverlit POKIBOT A PORTABLE ROBOT Square","$16/$25","1","deals","9"
                , "3 styles of Robotic Voice Playback, Responds to clapping, Pokibots can interact with each other, Includes free iOS & Android app for extra fun! "));
        words.put(10, Arrays.asList("BenQ TK800M 4K Home Cinema Projector -- 3840x2160, 3000 Lumens","$699/$999","1","deals","110"
                , "With four times the resolution of Full HD 1080p, 4K UHD reduces pixel blur for stunning clarity and crisply defined fine details to showcase the beautiful game."));
        return words;
    }


    //this method is to generate the apple products data.
    //there are 6 elements inside the map. The first is the productText, the second is product price,
    //the third one is number of images, the forth one is the product type, the fifth one is order digit,
    //the sixth is the product description.
    public static Map<Integer, List<String>> generateApples() {
        Map<Integer, List<String>>words =
                new LinkedHashMap<Integer, List<String>>();
        words.put(1, Arrays.asList("Apple iPhone 13 Pro Max 128GB Alpine Green","$1,999","5","apple","1"
                , "Smooth,responsive Super Retina XDR display with ProMotion. Huge camera system upgrade for dramatic new possibilities. The ultrafast A15 Bionic chip. "));
        words.put(2, Arrays.asList("Apple iPhone 12 64GB Black","$1,249","5","apple","2"
                , "5G speed. A14 Bionic, the ultrafast chip that powers iPhone 12. An edge-to-edge OLED display."));
        words.put(3, Arrays.asList("Apple iPhone 13 mini 128GB Starlight","$1,428","5","apple","3"
                , "A remarkably bright display in a durable design. Hollywood-worthy video shooting made easy. A lightening fast chip."));
        words.put(4, Arrays.asList("Apple iPad Pro 11 (3rd Gen)","$1,329","5","apple","4"
                , "The ultimate iPad experience. Now with next-level M1 performance, a breathtaking 12.9-inch Liquid Retina XDR display and blazing-fast 5G speed."));
        words.put(5, Arrays.asList("Apple iPad Air (5th Gen)","$1,025","5","apple","5"
                , "Supercharged by the Apple M1 chip. 12MP ultra wide front camera with Centre Stage. Blazing-fast 5G."));
        words.put(6, Arrays.asList("Apple 13 Macbook Pro (Space Grey)","$2,149","5","apple","6"
                , "The Apple M1 chip gives the 13-inch MacBook Pro speed and power beyond belief. With up to 2.8x CPU performance. Up to 5x the graphics speed."));
        words.put(7, Arrays.asList("Apple 21.5 iMac","$1,798","5","apple","7"
                , "new 27-inch model elevates the experience in every way, with faster processors and graphics, expanded memory and storage, enhanced audio and video capabilities, and an even more stunning Retina 5K display."));
        words.put(8, Arrays.asList("Apple 13 Macbook Air (Space Grey)","$1,699","5","apple","8"
                , "Apple's thinnest, lightest notebook, completely transformed by the Apple M1 chip. CPU speeds up to 3.5x faster. GPU speeds up to 5x faster"));
        words.put(9, Arrays.asList("Apple Watch Nike Series 7 GPS","$689","5","apple","9"
                , ""));
        words.put(10, Arrays.asList("Apple MagSafe Duo Wireless Charger - White","$249","5","apple","110"
                , "Just place your devices on the charger and a steady, efficient charge begins on contact. The charger folds together neatly so you can easily take it with you wherever you go."));
        return words;
    }

    //this method is to generate the Samsung products data.
    //there are 6 elements inside the map. The first is the productText, the second is product price,
    //the third one is number of images, the forth one is the product type, the fifth one is order digit,
    //the sixth is the product description.
    public static Map<Integer, List<String>> generateSamsungs() {
        Map<Integer, List<String>>words =
                new LinkedHashMap<Integer, List<String>>();
        words.put(1, Arrays.asList("Samsung Galaxy S21","$1099","5","samsung","1"
                , "The Galaxy S21 FE 5G packs everything you love into a 6.4 inch body - a size made for connecting with friends, exploring new passions, going live and binging your favourite shows."));
        words.put(2, Arrays.asList("Samsung Galaxy Z Flip3 5G Foldable Smartphone","$1,599","5","samsung","2"
                , "Folds into your pocket. Tucks into your purse. Slips into your skinniest jeans. Then you can take it out and it flips open into a full-screened 5G smartphone and flexes to your favourite angles."));
        words.put(3, Arrays.asList("Samsung Galaxy Z Fold3 5G Dual SIM Foldable Smartphone","$2,699","5","samsung","3"
                , "The thinnest, most pocketable Galaxy Fold yet. Folded, it's a premium 6.2-inch smartphone that rocks the classic one-handed hold. Unfolded, you've got an expansive view that opens new possibilities."));
        words.put(4, Arrays.asList("Samsung Galaxy Tab S8 Ultra 5G + WiFi Tablet ( Grey )","$2,299","5","samsung","4"
                , "The largest Samsung Galaxy Tab S is designed so you can create like a pro. Shoot with our first ultra wide front camera in a tablet and edit on the largest screen in the Samsung Galaxy Tab S."));
        words.put(5, Arrays.asList("Samsung Galaxy Tab S6 Lite (WiFi Only) Tablet","$534","5","samsung","5"
                , "Feel like you're in the front row and enjoy the show in all it's glory on an awesome 10.4\" display. The sound is just as impressive with two speakers engineered by AKG."));
        words.put(6, Arrays.asList("Samsung QM65R 65 UHD Smart Digital Signage Display","$2,875","5","samsung","6"
                , "Samsung's new QMR series provides ultra high-definition 4K resolution, creating lifelike images with sharper picture quality than ever before."));
        words.put(7, Arrays.asList("Samsung LC27F390F 27 Curved Monitor 1920x1080 ","$343","5","samsung","7"
                , "Discover a truly immersive viewing experience with this Samsung deeply curved monitor. Wrapping around your field of vision the 1800R screen."));
        words.put(8, Arrays.asList("Samsung Galaxy Watch4 40mm BT Aluminium Gold","$398","5","samsung","8"
                , "The Samsung BioActive Sensor and our fastest chip brings the biggest innovation to Galaxy Watch yet."));
        words.put(9, Arrays.asList("Samsung Galaxy Tab Active Pro LTE Rugged Tablet 10.1","$948","1","samsung","9"
                , "Galaxy Tab Active Pro was built to be as active as you, whether indoor or out. IP68 water and dust resistance lets you handle it in various conditions, while anti-shock protection makes it extra durable."));
        words.put(10, Arrays.asList("Samsung Neo QN90A 55 Premium 4K Mini LED Smart TV","$2799","5","samsung","110"
                , "Evolution of Neo QLED comes with Quantum Matrix Technology, which precisely controls our exclusive new Quantum Mini LED."));
        return words;
    }

    //this method is to generate the Microsoft products data.
    //there are 6 elements inside the map. The first is the productText, the second is product price,
    //the third one is number of images, the forth one is the product type, the fifth one is order digit,
    //the sixth is the product description.
    public static Map<Integer, List<String>> generateMicrosofts() {
        Map<Integer, List<String>>words =
                new LinkedHashMap<Integer, List<String>>();
        words.put(1, Arrays.asList("Microsoft Surface Laptop Go For Home & Personal -12.4","$1,954","5","microsoft","1"
                , "Getting into your flow and making key connections is easier than ever on Surface Laptop 3, with multitasking USB-C™ and USB-A ports, interactive touchscreen, enhanced Studio Mics and wake on voice."));
        words.put(2, Arrays.asList("Microsoft Surface Laptop Studio - Intel Core i7","$3,099","5","microsoft","2"
                , "Bring big ideas to life without breaking a sweat, thanks to quad-core powered 11th Gen Intel® Core™ H Series processors and blazing NVIDIA® GeForce RTX™ 3050 Ti laptop GPU."));
        words.put(3, Arrays.asList("Microsoft Surface Go 3 Tablet - 10.5","$644","4","microsoft","3"
                , "Designed to light up the best of Windows 11, Surface Go 3 is optimised for digital pen and touch, with a faster Intel® Core™ processor and tablet-to-laptop versatility."));
        words.put(4, Arrays.asList("Microsoft Surface Pro 8 (Home & Personal Model)","$1,798","4","microsoft","4"
                , "Surface Pro 8 combines the power of a laptop with the flexibility of a tablet, and every angle in between, with the iconic Kickstand and larger 13 touchscreen."));
        words.put(5, Arrays.asList("Microsoft Surface Pro X LTE SQ2 (Windows 10 Home )","$2,398","5","microsoft","5"
                , "Connect nearly anywhere with friends, family, and colleagues over built-in HD webcams backed by Studio Mics, Dolby® Audio™, and blazing-fast, consistent LTE.3."));
        words.put(6, Arrays.asList("Microsoft Surface Laptop 4 ","$1,030","5","microsoft","6"
                , "The lightest Surface Laptop features our signature 3:2 aspect ratio that helps you see and do more, all on a 12.4\" PixelSense™ touchscreen, in premium materials and choice of colours.4,6."));
        words.put(7, Arrays.asList("Microsoft Surface Pro 7+ for Business ","$2,099","4","microsoft","7"
                , "Power professional-grade software and essential business apps 2.1 times faster than before. Maintain control of sensitive information with a removable solid-state drive for data retention."));
        words.put(8, Arrays.asList("Microsoft Xbox Series S 512GB Console","$549","5","microsoft","8"
                , "Faster load times. Sip quick. Games load significantly faster with the custom SSD in the Xbox Series S."));
        words.put(9, Arrays.asList("Microsoft Xbox Elite Wireless Controller Series 2","$279","5","microsoft","9"
                , "Designed to meet the needs of today's competitive gamers, the Xbox Elite Wireless Controller Series 2 features over 30 new ways to play like a pro."));
        words.put(10, Arrays.asList("Microsoft Signature Keyboard for Surface Pro 8/ Slim Pen 2","$459","5","microsoft","110"
                , "Transform Surface Pro 8[1] and Surface Pro X[1] into a full laptop with the premium keyboard. And with Surface Slim Pen 2 stored, charged, and close at hand."));
        return words;
    }

    //this method is to generate all products data.
    //there are 6 elements inside the map. The first is the productText, the second is product price,
    //the third one is number of images, the forth one is the product type, the fifth one is order digit,
    //the sixth is the product description.
    public static Map<Integer, List<String>> generateAllProducts() {
        Map<Integer, List<String>>words =
                new LinkedHashMap<Integer, List<String>>();
        words.put(1, Arrays.asList("Samsung Galaxy Z Fold3 5G Dual SIM Foldable Smartphone(Black)","$2,698","5","newproducts","1"
                , "Flex mode supported at angles between 75° and 115°. For your convenience, it may be difficult to maintain Flex mode while moving due to shaking or other movement."));
        words.put(2, Arrays.asList("Samsung Galaxy A13 (2022) Dual SIM Smartphone(Light Blue)","$348","5","newproducts","2"
                , "Expand your view to the 6.6-inch Infinity-V Display of Galaxy A13 and see what you've been missing.Snap memorable moments in clear detail with the 50MP Main Camera."));
        words.put(3, Arrays.asList("ASUS Vivobook 15 R565EA Edu Laptop 15.6 FHD Intel i3-1115G4 8GB 256GB SSD","$910","5","newproducts","3"
                , "It's powered by up to an Intel® Core™ i3 processor with 8 GB 2400 MHz RAM."));
        words.put(4, Arrays.asList("HP Probook x360 435 G8 Ultrabook 13.3 FHD Touch Ryzen3 5400U 8GB 256GB SSD","$1,171","5","newproducts","4"
                , "The versatile ultraslim HP ProBook x360 435 adapts throughout the day, with four use modes that enable you to create, present, and collaborate in a comfortable way."));
        words.put(5, Arrays.asList("Sony WH-1000XM5 Wireless Over-Ear Noise-Cancelling Headphones","$598","5","newproducts","5"
                , "Specially developed by Sony, the new Integrated Processor V1 unlocks the full potential of our HD Noise Cancelling Processor QN1. This unique combination of technology controls eight microphones to deliver unprecedented noise cancelling quality."));
        words.put(6, Arrays.asList("NOS X700 Complete Streaming Starter Pack","$199","5","newproducts","6"
                , "The package includes a microphone that reduces background noise and focuses on your voice, boom arm, tripod, USB ring light, Full HD webcam and a USB hub with four ports."));
        words.put(7, Arrays.asList("Orico 6 in 1 Multifunction Docking Station","$64","4","newproducts","7"
                , "Do you want to work with two screens or mirror one screen? Then this is possible by means of the aluminum type-C hub with 4K HDMI connection. Enjoy excellent 4K image quality."));
        words.put(8, Arrays.asList("Steelseries 2022 Aerox 5 RGB Wireless Ultra Lightweight Gaming Mouse","$278","5","newproducts","8"
                , "The macros you need are at your fingertips, and so is victory. Instantly execute game-winning actions with a 5-button side panel, including a custom-built up/down flick switch."));
        words.put(9, Arrays.asList("Samsung 50AU800A 50 4K Premium Hotel / Commercial TV","$1,035","5","newproducts","9"
                , "Offer guests the vivid picture quality of home entertainment systems, using upscaling technology to display content in UHD resolution (3,840 X2,160), four times the pixels of standard FHD."));
        words.put(10, Arrays.asList("Samsung The FreeStyle - Full HD Smart Portable Projector","$1,699","5","newproducts","110"
                , "The Freestyle is compatible with external batteries that support USB-PD and 50W/20V output or above."));


        words.put(11, Arrays.asList("Sony WH-1000XM5 Wireless Over-Ear Noise-Cancelling Headphones - Black","$598","3","topproducts","1"
                , "The brand-new super-comfortable lightweight design will keep you in the zone for up to 30 hours, and get ready for your next adventure in a flash thanks to USB-PD fast charging."));
        words.put(12, Arrays.asList("Xiaomi 12 Pro 5G Dual SIM Smartphone 12GB+256GB - Blue","$1,598","3","topproducts","2"
                , "Embracing Snapdragon® 8 Gen 1, the flagship 4nm processor is designed to master all the phenomenal innovations with more dynamic power and a cooler attitude."));
        words.put(13, Arrays.asList("Samsung Galaxy A53 5G (2022) Dual SIM Smartphone","$749","3","topproducts","3"
                , "The Galaxy A53 5G is designed to stand out. With the Ambient Edge blending the camera with the body seamlessly, your Galaxy is entirely beautiful and fully functional with added battery capacity inside a slimmer, matte frame."));
        words.put(14, Arrays.asList("Microsoft Surface Laptop Go (Student Price) -12.4-i5 8GB Ram 128GB","$1,030","3","topproducts","4"
                , "Browse, scroll, navigate and binge-just as you would on a smartphone-on the 12.4\" PixelSense™ HD touchscreen with precision colour calibration."));
        words.put(15, Arrays.asList("NETGEAR Insight Managed WAX610 WiFi 6 Dual-Band AX1800 Indoor Access Point","$238","3","topproducts","5"
                , "The WAX610 is ideal in high-density client device environments, such as schools, hotels, restaurants and conference centers, and provides enterprise-grade Wi-Fi network security"));



        words.put(16, Arrays.asList("Google Nest Cam with Floodlight (Wired)","$462/$549","4","deals","1"
                , "The Nest Cam security camera knows the difference between people, pets and vehicles, so it can send alerts that matter to you."));
        words.put(17, Arrays.asList("Philips PUT7906/75 65 4K Android Smart TV with Ambilight","$888/$998","4","deals","2"
                ,""));
        words.put(18, Arrays.asList("Samsung Q600A 3.1.2 Channel Sound Bar","$599/$699","5","deals","3"
                , "Control your Philips Android TV with your voice. Want to play a game, watch Netflix, or find content and apps in the Google Play store? Just tell your TV."));
        words.put(19, Arrays.asList("Cooler Master MasterPulse CH321 USB Multi-Platform Gaming Headset","$45/$65","5","deals","4"
                , "An onboard sound card plus 50mm Neodymium drivers on the CH321 offers top-tier sound typically found in more premium headsets."));
        words.put(20, Arrays.asList("Fitbit Versa 3 Smart Watch - Black","$289/449","4","deals","5"
                , "Do more, charge less and fuel up for a full day in just 12 minutes with fast charging. Stay connected on the go with call, text and smartphone app notifications from your wrist. "));
        words.put(21, Arrays.asList("KONIC Series 696 55 4K Android Smart TV","$803/$898","4","deals","6"
                , "Offers a screen with a resolution of 3840*2160 pixels, which is capable of reproducing the original visual details with amazing fidelity. So every picture is vivid before your eyes."));
        words.put(22, Arrays.asList("Xiaomi Mi Home Wi-Fi Security Camera 2K with Magnetic Mount","$54/$78","5","deals","7"
                , "The Mi Camera 2K (Magnetic Mount) comes equipped with AI human detection technology, which can effectively filter out false alarms, so you will only be notified when there is human motion."));
        words.put(23, Arrays.asList("HP Officejet 200 Portable printer","$345/$438","5","deals","8"
                , "Simply print from your laptop or mobile devices wirelessly, with or without a router. Start printing in minutes. HP Auto Wireless Connect makes setup easy."));
        words.put(24, Arrays.asList("Silverlit POKIBOT A PORTABLE ROBOT Square","$16/$25","1","deals","9"
                , "3 styles of Robotic Voice Playback, Responds to clapping, Pokibots can interact with each other, Includes free iOS & Android app for extra fun! "));
        words.put(25, Arrays.asList("BenQ TK800M 4K Home Cinema Projector -- 3840x2160, 3000 Lumens","$699/$999","1","deals","110"
                , "With four times the resolution of Full HD 1080p, 4K UHD reduces pixel blur for stunning clarity and crisply defined fine details to showcase the beautiful game."));

        words.put(26, Arrays.asList("Apple iPhone 13 Pro Max 128GB Alpine Green","$1,999","5","apple","1"
                , "Smooth,responsive Super Retina XDR display with ProMotion. Huge camera system upgrade for dramatic new possibilities. The ultrafast A15 Bionic chip. "));
        words.put(27, Arrays.asList("Apple iPhone 12 64GB Black","$1,249","5","apple","2"
                , "5G speed. A14 Bionic, the ultrafast chip that powers iPhone 12. An edge-to-edge OLED display."));
        words.put(28, Arrays.asList("Apple iPhone 13 mini 128GB Starlight","$1,428","5","apple","3"
                , "A remarkably bright display in a durable design. Hollywood-worthy video shooting made easy. A lightening fast chip."));
        words.put(29, Arrays.asList("Apple iPad Pro 11 (3rd Gen)","$1,329","5","apple","4"
                , "The ultimate iPad experience. Now with next-level M1 performance, a breathtaking 12.9-inch Liquid Retina XDR display and blazing-fast 5G speed."));
        words.put(30, Arrays.asList("Apple iPad Air (5th Gen)","$1,025","5","apple","5"
                , "Supercharged by the Apple M1 chip. 12MP ultra wide front camera with Centre Stage. Blazing-fast 5G."));
        words.put(31, Arrays.asList("Apple 13 Macbook Pro (Space Grey)","$2,149","5","apple","6"
                , "The Apple M1 chip gives the 13-inch MacBook Pro speed and power beyond belief. With up to 2.8x CPU performance. Up to 5x the graphics speed."));
        words.put(32, Arrays.asList("Apple 21.5 iMac","$1,798","5","apple","7"
                , "new 27-inch model elevates the experience in every way, with faster processors and graphics, expanded memory and storage, enhanced audio and video capabilities, and an even more stunning Retina 5K display."));
        words.put(33, Arrays.asList("Apple 13 Macbook Air (Space Grey)","$1,699","5","apple","8"
                , "Apple's thinnest, lightest notebook, completely transformed by the Apple M1 chip. CPU speeds up to 3.5x faster. GPU speeds up to 5x faster"));
        words.put(34, Arrays.asList("Apple Watch Nike Series 7 GPS","$689","5","apple","9"
                , ""));
        words.put(35, Arrays.asList("Apple MagSafe Duo Wireless Charger - White","$249","5","apple","110"
                , "Just place your devices on the charger and a steady, efficient charge begins on contact. The charger folds together neatly so you can easily take it with you wherever you go."));

        words.put(36, Arrays.asList("Samsung Galaxy S21","$1099","5","samsung","1"
                , "The Galaxy S21 FE 5G packs everything you love into a 6.4 inch body - a size made for connecting with friends, exploring new passions, going live and binging your favourite shows."));
        words.put(37, Arrays.asList("Samsung Galaxy Z Flip3 5G Foldable Smartphone","$1,599","5","samsung","2"
                , "Folds into your pocket. Tucks into your purse. Slips into your skinniest jeans. Then you can take it out and it flips open into a full-screened 5G smartphone and flexes to your favourite angles."));
        words.put(38, Arrays.asList("Samsung Galaxy Z Fold3 5G Dual SIM Foldable Smartphone","$2,699","5","samsung","3"
                , "The thinnest, most pocketable Galaxy Fold yet. Folded, it's a premium 6.2-inch smartphone that rocks the classic one-handed hold. Unfolded, you've got an expansive view that opens new possibilities."));
        words.put(39, Arrays.asList("Samsung Galaxy Tab S8 Ultra 5G + WiFi Tablet ( Grey )","$2,299","5","samsung","4"
                , "The largest Samsung Galaxy Tab S is designed so you can create like a pro. Shoot with our first ultra wide front camera in a tablet and edit on the largest screen in the Samsung Galaxy Tab S."));
        words.put(40, Arrays.asList("Samsung Galaxy Tab S6 Lite (WiFi Only) Tablet","$534","5","samsung","5"
                , "Feel like you're in the front row and enjoy the show in all it's glory on an awesome 10.4\" display. The sound is just as impressive with two speakers engineered by AKG."));
        words.put(41, Arrays.asList("Samsung QM65R 65 UHD Smart Digital Signage Display","$2,875","5","samsung","6"
                , "Samsung's new QMR series provides ultra high-definition 4K resolution, creating lifelike images with sharper picture quality than ever before."));
        words.put(42, Arrays.asList("Samsung LC27F390F 27 Curved Monitor 1920x1080 ","$343","5","samsung","7"
                , "Discover a truly immersive viewing experience with this Samsung deeply curved monitor. Wrapping around your field of vision the 1800R screen."));
        words.put(43, Arrays.asList("Samsung Galaxy Watch4 40mm BT Aluminium Gold","$398","5","samsung","8"
                , "The Samsung BioActive Sensor and our fastest chip brings the biggest innovation to Galaxy Watch yet."));
        words.put(44, Arrays.asList("Samsung Galaxy Tab Active Pro LTE Rugged Tablet 10.1","$948","1","samsung","9"
                , "Galaxy Tab Active Pro was built to be as active as you, whether indoor or out. IP68 water and dust resistance lets you handle it in various conditions, while anti-shock protection makes it extra durable."));
        words.put(45, Arrays.asList("Samsung Neo QN90A 55 Premium 4K Mini LED Smart TV","$2799","5","samsung","110"
                , "Evolution of Neo QLED comes with Quantum Matrix Technology, which precisely controls our exclusive new Quantum Mini LED."));

        words.put(46, Arrays.asList("Microsoft Surface Laptop Go For Home & Personal -12.4","$1,954","5","microsoft","1"
                , "Getting into your flow and making key connections is easier than ever on Surface Laptop 3, with multitasking USB-C™ and USB-A ports, interactive touchscreen, enhanced Studio Mics and wake on voice."));
        words.put(47, Arrays.asList("Microsoft Surface Laptop Studio - Intel Core i7","$3,099","5","microsoft","2"
                , "Bring big ideas to life without breaking a sweat, thanks to quad-core powered 11th Gen Intel® Core™ H Series processors and blazing NVIDIA® GeForce RTX™ 3050 Ti laptop GPU."));
        words.put(48, Arrays.asList("Microsoft Surface Go 3 Tablet - 10.5","$644","4","microsoft","3"
                , "Designed to light up the best of Windows 11, Surface Go 3 is optimised for digital pen and touch, with a faster Intel® Core™ processor and tablet-to-laptop versatility."));
        words.put(49, Arrays.asList("Microsoft Surface Pro 8 (Home & Personal Model)","$1,798","4","microsoft","4"
                , "Surface Pro 8 combines the power of a laptop with the flexibility of a tablet, and every angle in between, with the iconic Kickstand and larger 13 touchscreen."));
        words.put(50, Arrays.asList("Microsoft Surface Pro X LTE SQ2 (Windows 10 Home )","$2,398","5","microsoft","5"
                , "Connect nearly anywhere with friends, family, and colleagues over built-in HD webcams backed by Studio Mics, Dolby® Audio™, and blazing-fast, consistent LTE.3."));
        words.put(51, Arrays.asList("Microsoft Surface Laptop 4 ","$1,030","5","microsoft","6"
                , "The lightest Surface Laptop features our signature 3:2 aspect ratio that helps you see and do more, all on a 12.4\" PixelSense™ touchscreen, in premium materials and choice of colours.4,6."));
        words.put(52, Arrays.asList("Microsoft Surface Pro 7+ for Business ","$2,099","4","microsoft","7"
                , "Power professional-grade software and essential business apps 2.1 times faster than before. Maintain control of sensitive information with a removable solid-state drive for data retention."));
        words.put(53, Arrays.asList("Microsoft Xbox Series S 512GB Console","$549","5","microsoft","8"
                , "Faster load times. Sip quick. Games load significantly faster with the custom SSD in the Xbox Series S."));
        words.put(54, Arrays.asList("Microsoft Xbox Elite Wireless Controller Series 2","$279","5","microsoft","9"
                , "Designed to meet the needs of today's competitive gamers, the Xbox Elite Wireless Controller Series 2 features over 30 new ways to play like a pro."));
        words.put(55, Arrays.asList("Microsoft Signature Keyboard for Surface Pro 8/ Slim Pen 2","$459","5","microsoft","110"
                , "Transform Surface Pro 8[1] and Surface Pro X[1] into a full laptop with the premium keyboard. And with Surface Slim Pen 2 stored, charged, and close at hand."));

        return words;
    }


    //this method is used to generate five random items from all item list.
    public static List<Product> getRandomProducts(){
        List<Product> outputList = new ArrayList<>();
        List<Product> inputList = getProducts("All Items");

        for(int i = 0; i < 5; i++){
            int randomNumber = (int)(Math.random()*(55-1+1)+1);
            Product item = inputList.get(randomNumber);
            item.setOrderDigit(i+1);
            outputList.add(item);
        }

        return  outputList;
    }


//this method is used to get products by giving a category or mode input.
    public static List<Product> getProducts(String category) {
        List<Product> productsList = new LinkedList<Product>();
        Map<Integer, List<String>>words =
                new LinkedHashMap<Integer, List<String>>();
        switch (category){
            //get the words map by specific category.
            case "topproducts" :
                words = generateTopPicks();
                break;
            case "newproducts":
                words = generatenewProducts();
                break;
            case "deals":
                words= generateDeals();
                break;
            case "apple":
                 words = generateApples();
                break;
            case "samsung":
                words = generateSamsungs();
                break;
            case "microsoft":
                words = generateMicrosofts();
                break;
            case "search":
                words = generateAllProducts();
            case "All Items":
                words = generateAllProducts();
        }
        for (Integer key : words.keySet()) {
            int orderDigit = key;  //initialise the product objects and put them inside a list.
            int digit = Integer.valueOf(words.get(key).get(4));
            String productText = words.get(key).get(0);
            String price = words.get(key).get(1);
            int numOfImgs = Integer.valueOf(words.get(key).get(2));
            Product n = new Product(key,digit, productText, words.get(key).get(3),price,numOfImgs,
                    words.get(key).get(5));
            productsList.add(n);
        }
        return productsList;
    }
}
