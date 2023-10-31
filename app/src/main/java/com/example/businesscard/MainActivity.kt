import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.R
import com.example.businesscard.ui.theme.BusinessCardTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BusinessCard() {
    // Contactos
    var telefono by remember { mutableStateOf("123 456 789") }
    var github by remember { mutableStateOf("github.com/lbrunio") }
    var socialMedia by remember { mutableStateOf("@Me") }
    var email by remember { mutableStateOf("lbrunioragel@educa.madrid") }

    // Imagenes
    val backgroundRes = painterResource(id = R.drawable.bg)
    val profilePictureRes = painterResource(id = R.drawable.me)

    // Colores
    val colorBanana = Color(0xFFefca93)
    val colorAbeja = Color(0xFFd88f00)
    val colorFlabellinopsis = Color(0xFF812A89)
    val colorViola = Color(0xFFFF6CDC)


    // Tipo letra
    val customFont = FontFamily(
        Font(R.font.myfonts)
    )

    val myfont = TextStyle(
        fontFamily = customFont,
        fontSize = 16.sp,
        color = Color.Black
    )


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = backgroundRes,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(0xAA000000))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = profilePictureRes,
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .clip(shape = MaterialTheme.shapes.small)
                    .border(2.dp, Color.White, shape = MaterialTheme.shapes.small)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "ryan Gosling",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorBanana,
                    fontFamily = customFont
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp)
            )

            Text(
                text = "I Drive",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = colorAbeja,
                    fontFamily = customFont
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp)
            )

            Text(
                text = "She can fix me",
                style = TextStyle(
                    fontSize = 8.sp,
                    color = colorAbeja,
                    fontFamily = customFont
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp)
            )

            Text(
                text = "Contacto",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorViola,
                    fontFamily = customFont
                ),
                modifier = Modifier.padding(8.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(52.dp),
                    painter = painterResource(id = R.drawable.phone),
                    contentDescription = null,
                    tint = Color.White
                )

                TextField(
                    value = telefono,
                    onValueChange = { telefono = it },
                    label = {
                        Text(
                            text = "Telefono",
                            color = colorFlabellinopsis,
                            style = myfont
                        )
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(52.dp),
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = null,
                    tint = Color.White
                )
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    label = {
                        Text(
                            text = "E-mail",
                            color = colorFlabellinopsis,
                            style = myfont
                        )
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    modifier = Modifier.size(52.dp),
                    painter = painterResource(id = R.drawable.github),
                    contentDescription = null,
                    tint = Color.White
                )
                TextField(
                    value = github,
                    onValueChange = { github = it },
                    label = {
                        Text(
                            text = "GitHub",
                            color = colorFlabellinopsis,
                            style = myfont
                        )
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(52.dp),
                    painter = painterResource(id = R.drawable.social_media),
                    contentDescription = null,
                    tint = Color.White
                )
                TextField(
                    value = socialMedia,
                    onValueChange = { socialMedia = it },
                    label = {
                        Text(
                            text = "Social Media",
                            color = colorFlabellinopsis,
                            style = myfont
                        )
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                )
            }
        }
    }
}

@Composable
@Preview
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }

}
